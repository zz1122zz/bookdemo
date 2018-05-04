package org.creation.demo.service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月4日 下午2:51:06 
* 类说明 
*/
/**
 * <p>Title: Module Information         </p>
 * <p>Description: Function Description </p>
 * <p>Copyright: Copyright (c) 2018     </p>
 * <p>Company: ND Co., Ltd.       </p>
 * <p>Create Time: 2018年5月4日           </p>
 * @author LiuPeng
 * <p>Update Time: 2018年5月4日               </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
@Service
public class CacheService {
    @PostConstruct
    public void init() {
        int a =0;
        a=a++;
    }

}
