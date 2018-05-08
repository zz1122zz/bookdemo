package org.creation.demo.controller.admin;

import javax.annotation.Resource;

import org.creation.demo.entity.base.Entity;
import org.creation.demo.entity.base.NumericProperty;
import org.creation.demo.entity.base.StringProperty;
import org.creation.demo.service.DBEntityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/** 
* @author 作者 LiuPeng E-mail: 
* @version 创建时间：2018年5月8日 下午3:20:41 
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

@RestController
@RequestMapping("/v0.1/admin")
public class DBEntityController {

    @Resource
    private DBEntityService DBEntityService;
    @RequestMapping(value = "/entity/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Entity getEntity(@PathVariable long id) {
        return DBEntityService.getEntity(id);
    }
    @RequestMapping(value = "/entity", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int saveEntity(@RequestBody Entity properties) {
        return DBEntityService.saveEntity(properties);
    }
    @RequestMapping(value = "/entity/{id}", method = RequestMethod.DELETE, produces = {"application/json;charset=UTF-8"})
    public int deleteEntity(@PathVariable long id) {
        return DBEntityService.deleteEntity(id);
    }
    @RequestMapping(value = "/entity/{id}", method = RequestMethod.PATCH, produces = {"application/json;charset=UTF-8"})
    public int getEntity(@PathVariable long id,@RequestBody Entity properties) {
        return DBEntityService.updateEntity(id,properties);
    }
    @RequestMapping(value = "/properties/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public NumericProperty getNumericProperty(@PathVariable long id) {
        return DBEntityService.getNumericProperty(id);
    }
    @RequestMapping(value = "/properties", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int saveNumericProperty(@RequestBody NumericProperty properties) {
        return DBEntityService.saveNumericProperty(properties);
    }
    @RequestMapping(value = "/properties/{id}", method = RequestMethod.DELETE, produces = {"application/json;charset=UTF-8"})
    public int deleteNumericProperty(@PathVariable long id) {
        return DBEntityService.deleteNumericProperty(id);
    }
    @RequestMapping(value = "/properties/{id}", method = RequestMethod.PATCH, produces = {"application/json;charset=UTF-8"})
    public int getNumericProperty(@PathVariable long id,@RequestBody NumericProperty properties) {
        return DBEntityService.updateNumericProperty(id,properties);
    }
    @RequestMapping(value = "/stringproperties/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public StringProperty getStringProperty(@PathVariable long id) {
        return DBEntityService.getStringProperty(id);
    }
    @RequestMapping(value = "/stringproperties", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public int saveStringProperty(@RequestBody StringProperty properties) {
        return DBEntityService.saveStringProperty(properties);  
    }
    @RequestMapping(value = "/stringproperties/{id}", method = RequestMethod.DELETE, produces = {"application/json;charset=UTF-8"})
    public int deleteStringProperty(@PathVariable long id) {
        return DBEntityService.deleteStringProperty(id);
    }
    @RequestMapping(value = "/stringproperties/{id}", method = RequestMethod.PATCH, produces = {"application/json;charset=UTF-8"})
    public int getStringProperty(@PathVariable long id,@RequestBody StringProperty properties) {
        return DBEntityService.updateStringProperty(id,properties);
    }
}
