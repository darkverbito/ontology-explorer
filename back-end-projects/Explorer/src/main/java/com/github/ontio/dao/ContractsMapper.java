package com.github.ontio.dao;

import com.github.ontio.model.Contracts;

import java.util.List;
import java.util.Map;

public interface ContractsMapper {
    int deleteByPrimaryKey(String contract);

    int insert(Contracts record);

    int insertSelective(Contracts record);

    Contracts selectByPrimaryKey(String contract);

    int updateByPrimaryKeySelective(Contracts record);

    int banchUpdateByPrimaryKeySelective(List<Contracts> records);

    int updateByPrimaryKey(Contracts record);

    int selectContractCount();

    List<Map> selectApprovedContractByPage(Map<String, Object> paramMap);

    List<Map> selectContract();

    String selectCreatorByContractHash(String contract);

    Contracts selectContractByContractHash(String contract);

    List<Contracts> selectAllContract();

    List<Contracts> selectAllContractByProject(String project);
}