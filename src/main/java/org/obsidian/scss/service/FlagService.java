package org.obsidian.scss.service;

import org.obsidian.scss.entity.Flag;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface FlagService {
    int insertFlag(String name);

    int deleteFlag(int flagId);

    int updateFlag(int flagId,String name);

    String selectName(int clientId);

    int selectFlagId(String name);

    List<Flag> selectAllFlag(int clientId);
}