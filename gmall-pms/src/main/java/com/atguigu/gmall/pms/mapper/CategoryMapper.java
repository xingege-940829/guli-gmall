package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xingege
 * @email xinge@atguigu.com
 * @date 2020-12-14 20:06:53
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
