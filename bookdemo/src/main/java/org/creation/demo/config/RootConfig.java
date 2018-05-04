package org.creation.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月4日 下午2:49:30 
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
@Configuration
@ComponentScan(basePackages = {"org.creation.demo.service"}, excludeFilters = {@Filter({RestController.class, Controller.class})})
@Import(value = {PersistenceConfig.class})
public class RootConfig {

}
