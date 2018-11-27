package cn.itheima.dao.impl;

import org.hibernate.Session;

import cn.itheima.dao.LinkManDao;
import cn.itheima.domain.LinkMan;
import cn.itheima.utils.HibernateUtils;

public class LinkManDaoImpl implements LinkManDao {

	//保存联系人
	public void save(LinkMan lm) {
		Session session = 	HibernateUtils.getCurrentSession();
		session.save(lm);
	}

}
