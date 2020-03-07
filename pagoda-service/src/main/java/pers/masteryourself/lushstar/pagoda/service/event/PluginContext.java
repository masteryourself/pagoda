package pers.masteryourself.lushstar.pagoda.service.event;

import pers.masteryourself.lushstar.pagoda.service.bo.PluginBo;
import pers.masteryourself.lushstar.pagoda.service.response.DeferredResultWrapper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>description : PluginContext
 *
 * <p>blog : https://Blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/3/7 20:57
 */
public class PluginContext {

    /**
     * hold request
     * key:appName
     * value:DeferredResultWrapper
     */
    public static final Map<String, DeferredResultWrapper> HOLD_REQUEST_CONFIGS = new ConcurrentHashMap<>();

    /**
     * cache plugin change
     * key:appName
     * value:PluginChangeModel
     */
    public static final Map<String, PluginBo> CACHE_CONFIGS = new ConcurrentHashMap<>();

}