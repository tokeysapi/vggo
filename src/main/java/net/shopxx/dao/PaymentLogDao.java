/*
 * Copyright 2005-2015 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package net.shopxx.dao;

import net.shopxx.entity.PaymentLog;

/**
 * Dao - 支付记录
 * 
 * @author SHOP++ Team
 * @version 4.0
 */
public interface PaymentLogDao extends BaseDao<PaymentLog, Long> {

	/**
	 * 根据编号查找支付记录
	 * 
	 * @param sn
	 *            编号(忽略大小写)
	 * @return 支付记录，若不存在则返回null
	 */
	PaymentLog findBySn(String sn);

}