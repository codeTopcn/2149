package com.entity.view;

import com.entity.FupinzhengceEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 扶贫政策
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fupinzhengce")
public class FupinzhengceView extends FupinzhengceEntity implements Serializable {
    private static final long serialVersionUID = 1L;




	public FupinzhengceView() {

	}

	public FupinzhengceView(FupinzhengceEntity fupinzhengceEntity) {
		try {
			BeanUtils.copyProperties(this, fupinzhengceEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















}
