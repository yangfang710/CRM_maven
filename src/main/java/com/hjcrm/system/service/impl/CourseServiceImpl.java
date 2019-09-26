package com.hjcrm.system.service.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hjcrm.publics.dao.IDataAccess;
import com.hjcrm.publics.util.PageBean;
import com.hjcrm.publics.util.UserContext;
import com.hjcrm.system.entity.Course;
import com.hjcrm.system.entity.Subject;
import com.hjcrm.system.service.ICourseService;

@Service
@Transactional(rollbackFor = Exception.class)
public class CourseServiceImpl implements ICourseService {
	
	@Autowired
	private IDataAccess<Course> courseDao;
	@Autowired
	private IDataAccess<Subject> subjectDao;
	
	/**
	 * 查询所有课程
	 */
	
	public List<Course> queryCourse(PageBean pageBean) {
		List<Course> list = courseDao.queryByStatment("queryCourse", null, pageBean);
		return list;
	}

	/**
	 * 增加或者修改课程
	 */
	
	public void saveOrUpdate(Course course) {
		if (course != null && course.getCourseid() != null) {//修改
			course.setUpdate_time(new Timestamp(System.currentTimeMillis()));
			course.setUpdate_id(UserContext.getLoginUser().getUserid());
			courseDao.update(course);
		}else if(course != null && course.getCourseid() == null){//增加
			course.setCreate_time(new Timestamp(System.currentTimeMillis()));
			course.setCreate_id(UserContext.getLoginUser().getUserid());
			courseDao.insert(course);
		}
	}

	/**
	 * 删除课程
	 * 课程ID用逗号隔开，支持批量
	 */
	
	public void deleteCourse(String courseids) {
		if(courseids != null && !"".equals(courseids)){
			courseDao.deleteByIds(Course.class, courseids);
		}
	}

	/**
	 * 保存/修改科目
	 */
	
	public void saveOrUpdate(Subject subject) {
		if (subject != null && subject.getSubjectid() != null) {
			subject.setUpdate_id(UserContext.getLoginUser().getUserid());
			subject.setUpdate_time(new Timestamp(System.currentTimeMillis()));
			subjectDao.update(subject);
		}else if(subject != null && subject.getSubjectid() == null) {
			subject.setCreate_id(UserContext.getLoginUser().getUserid());
			subject.setCreate_time(new Timestamp(System.currentTimeMillis()));
			subjectDao.insert(subject);
		}
	}

	/**
	 * 删除科目
	 */
	
	public void deleteSubject(String subjectids) {
		if (subjectids != null && !"".equals(subjectids)) {
			subjectDao.deleteByIds(Subject.class, subjectids);
		}
	}

	/**
	 * 查询科目
	 */
	
	public List<Subject> querySubject(Long courseid, PageBean pageBean) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("courseid", courseid);
		List<Subject> list = subjectDao.queryByStatment("querySubject", param, pageBean);
		return list;
	}

	/**
	 * 根据课程ID，查询课程
	 */
	@Cacheable(value = "baseCache",key = "#courseid+'queryCourseById'")
	
	public Course queryCourseById(Integer courseid) {
		List<Course> courses = courseDao.queryByStatment("queryCourseById", courseid,null);
		if (courses != null && courses.size() > 0) {
			return courses.get(0);
		}
		return null;
	}

	/**
	 * 根据课程ID，查询科目，用逗号隔开
	 */
//	@Cacheable(value = "baseCache",key = "#courseid+'querySubjectByCourseId'")
	public Subject querySubjectByCourseId(Integer courseid) {
		List<Subject> subject = subjectDao.queryByStatment("querySubjectByCourseId", courseid,null);
		if (subject != null && subject.size() > 0) {
			return subject.get(0);
		}
		return null;
	}
 
}
