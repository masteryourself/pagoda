package com.github.lushstar.pagoda.dal.repository;

import com.github.lushstar.pagoda.dal.model.PluginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p>description : PluginRepository
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/2/25 21:28
 */
public interface PluginRepository extends JpaRepository<PluginEntity, Long> {

    PluginEntity findByName(String name);

    PluginEntity findByClassName(String className);

}