package org.creation.demo.entity.base;

import java.util.List;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月8日 下午2:15:38 
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
public class BaseEntity{
    
    public String type;
    
    public String uniqeEntityCode;

    public List<StringProperty> properties;
    
    public List<NumericProperty> numericProperties;
}
