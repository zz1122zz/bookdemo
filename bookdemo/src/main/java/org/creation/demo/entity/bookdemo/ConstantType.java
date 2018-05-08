package org.creation.demo.entity.bookdemo;

import org.creation.demo.entity.base.Type;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月8日 下午2:24:40 
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
public enum ConstantType implements Type {
    BOOK("书","BOOK"),
    BOOK_TYPE("图书类型","BOOK_TYPE"),
    DEPOSITORY("仓库","DEPOSITORY"),
    DEPOSITORY_TYPE("仓库类型","DEPOSITORY_TYPE")
    ;
    
    public String name;
    public String uniqeCode;

    private ConstantType(String name, String uniqeCode) {
        this.name = name;
        this.uniqeCode = uniqeCode;
    }

    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @return
     */
    @Override
    public String getTypeName() {
        return null;
    }

    /**	
     * <p>Description:              </p>
     * <p>Create Time: 2018年5月8日   </p>
     * <p>Create author: LiuPeng   </p>
     * @return
     */
    @Override
    public String getUniqeCode() {
        return null;
    }

}
