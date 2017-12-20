package com.nb.groupfan.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nb.groupfan.common.BaseDao;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseService<T> {

    //注入Mapper<T>
    @Autowired
    private BaseDao<T> baseDao;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    public BaseService(){
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }
    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    public T queryById(Object id) {
        return baseDao.selectByPrimaryKey(id);
    }

    /**
     * 根据条件查询实体数据
     *
     * @param fieldName
     * @param value
     * @return
     * @throws TooManyResultsException
     */
    public T queryBy(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return baseDao.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }
    /**
     * 查询所有数据
     *
     * @return
     */
    public List<T> queryAll() {
        return baseDao.selectAll();
    }

    /**
     * 根据条件查询一条数据，如果有多条数据会抛出异常
     *
     * @param record
     * @return
     */
    public T queryOne(T record) {
        return baseDao.selectOne(record);
    }

    /**
     * 根据条件查询数据列表
     *
     * @param record
     * @return
     */
    public List<T> queryListByWhere(T record) {
        return baseDao.select(record);
    }

    /**
     * 根据Condition条件进行查询总数
     * @param condition
     * @return
     */
    public List<T> queryByCondition(Object condition){
        return baseDao.selectByCondition(condition);
    }

    /**
     * 根据实体中的属性查询总数，查询条件使用等号
     *
     * @param record
     * @return
     */
    public int queryCount(T record){
        return baseDao.selectCount(record);
    }
    /**
     * 分页查询
     *
     * @param page
     * @param rows
     * @param record
     * @return
     */
    public PageInfo<T> queryPageListByWhere(Integer page, Integer rows, T record) {
        // 设置分页条件
        PageHelper.startPage(page, rows);
        List<T> list = this.queryListByWhere(record);
        return new PageInfo<T>(list);
    }

    /**
     * 新增数据，返回成功的条数
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     *
     * @param record
     * @return
     */
    public T save(T record) {
        baseDao.insertSelective(record);
        return record;
    }

    /**
     * 新增数据，使用不为null的字段，返回成功的条数
     *保存一个实体，null的属性不会保存，会使用数据库默认值
     * @param record
     * @return
     */
//    public int saveSelective(T record) {
//        return baseDao.insertSelective(record);
//    }

    /**
     * 批量插入
     * @param records
     * @return
     */
    public int saveList(List<T> records){
        return  baseDao.insertList(records);
    }

    /**
     * 修改数据，返回成功的条数
     * 根据主键更新实体全部字段，null值会被更新
     * @param record
     * @return
     */
    public int update(T record) {
        return baseDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 修改数据，使用不为null的字段，返回成功的条数
     * 根据主键更新属性不为null的值
     * @param record
     * @return
     */
//    public int updateSelective(T record) {
//        return baseDao.updateByPrimaryKeySelective(record);
//    }

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     * @param id
     * @return
     */
    public int deleteById(Object id) {
        return baseDao.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除
     *
     * @param ids
     * return
     */
    public int deleteByIds(String ids) {
        return baseDao.deleteByIds(ids);
    }

    /**
     * 根据条件做删除
     *
     * @param record
     * @return
     */
    public int deleteByWhere(T record) {
        return baseDao.delete(record);
    }


}