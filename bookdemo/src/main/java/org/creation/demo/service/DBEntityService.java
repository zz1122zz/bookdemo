package org.creation.demo.service;

import javax.annotation.Resource;

import org.creation.demo.entity.base.Entity;
import org.creation.demo.entity.base.NumericProperty;
import org.creation.demo.entity.base.StringProperty;
import org.creation.demo.entity.base.mysql.EntityMapper;
import org.creation.demo.entity.base.mysql.NumericPropertyMapper;
import org.creation.demo.entity.base.mysql.StringPropertyMapper;
import org.springframework.stereotype.Service;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月8日 下午4:57:10 
* 类说明 
*/
/**
 * <p>Title: Module Information         </p>
 * <p>Description: Function Description </p>
 * <p>Copyright: Copyright (c) 2018     </p>
 * <p>Company: ND Co., Ltd.       </p>
 * <p>Create Time: 2018年5月8日           </p>
 * @author LiuPeng
 * <p>Update Time: 2018年5月8日               </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */

@Service
public class DBEntityService {

    @Resource
    private EntityMapper entityMapper;
    @Resource
    private NumericPropertyMapper numericPropertyMapper;
    @Resource
    private StringPropertyMapper stringPropertyMapper;
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public Entity getEntity(long uniqueEntityCode) {
        return entityMapper.selectByPrimaryKey(uniqueEntityCode);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param entity
     * @return
     */
    public int saveEntity(Entity entity) {
        return entityMapper.insert(entity);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public int deleteEntity(long uniqueEntityCode) {
        return entityMapper.deleteByPrimaryKey(uniqueEntityCode);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @param entity
     * @return
     */
    public int updateEntity(long uniqueEntityCode, Entity entity) {
        entity.setUniqueEntityCode(uniqueEntityCode);
        return entityMapper.updateByPrimaryKeySelective(entity);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public NumericProperty getNumericProperty(long uniquePropertyCode) {
        return numericPropertyMapper.selectByPrimaryKey(uniquePropertyCode);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param properties
     * @return
     */
    public int saveNumericProperty(NumericProperty properties) {
        return numericPropertyMapper.insert(properties);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public int deleteNumericProperty(long uniquePropertyCode) {
        return numericPropertyMapper.deleteByPrimaryKey(uniquePropertyCode);
    }
    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @param properties
     * @return
     */
    public int updateNumericProperty(long uniquePropertyCode, NumericProperty properties) {
        properties.setUniquePropertyCode(uniquePropertyCode);
        return numericPropertyMapper.updateByPrimaryKeySelective(properties);
    }
    
    /** 
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public StringProperty getStringProperty(long uniquePropertyCode) {
        return stringPropertyMapper.selectByPrimaryKey(uniquePropertyCode);
    }
    /** 
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param properties
     * @return
     */
    public int saveStringProperty(StringProperty properties) {
        return stringPropertyMapper.insert(properties);
    }
    /** 
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @return
     */
    public int deleteStringProperty(long uniquePropertyCode) {
        return stringPropertyMapper.deleteByPrimaryKey(uniquePropertyCode);
    }
    /** 
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @param id
     * @param properties
     * @return
     */
    public int updateStringProperty(long uniquePropertyCode, StringProperty properties) {
        properties.setUniquePropertyCode(uniquePropertyCode);
        return stringPropertyMapper.updateByPrimaryKeySelective(properties);
    }
}
