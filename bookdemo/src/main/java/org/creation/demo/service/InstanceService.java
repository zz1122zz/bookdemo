package org.creation.demo.service;

import javax.annotation.Resource;

import org.creation.demo.entity.base.Entity;
import org.creation.demo.entity.base.NumericProperty;
import org.creation.demo.entity.base.StringProperty;
import org.creation.demo.entity.base.mysql.EntityMapper;
import org.creation.demo.entity.base.mysql.NumericPropertyMapper;
import org.creation.demo.entity.base.mysql.StringPropertyMapper;
import org.creation.demo.entity.instance.Instance;
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
public class InstanceService {

    @Resource
    private DBEntityService DBEntityService;
    
    public Instance getInstance() {
        return null;
    }
    
}
