package org.creation.demo.entity.instance;

import java.util.List;

import org.creation.demo.entity.base.Entity;
import org.creation.demo.entity.base.NumericProperty;
import org.creation.demo.entity.base.StringProperty;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月8日 下午9:09:05 
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
public class Instance extends Entity {
    private static final long serialVersionUID = 1L;

    public List<NumericProperty> numericProperties;

    public List<StringProperty> stringProperties;

    public List<NumericProperty> getNumericProperties() {
        return numericProperties;
    }

    public void setNumericProperties(List<NumericProperty> numericProperties) {
        this.numericProperties = numericProperties;
    }

    public List<StringProperty> getStringProperties() {
        return stringProperties;
    }

    public void setStringProperties(List<StringProperty> stringProperties) {
        this.stringProperties = stringProperties;
    }

}
