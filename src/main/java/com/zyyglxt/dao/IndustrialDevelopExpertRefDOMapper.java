package com.zyyglxt.dao;

import com.zyyglxt.dataobject.IndustrialDevelopExpertRefDO;
import com.zyyglxt.dataobject.IndustrialDevelopExpertRefDOKey;

public interface IndustrialDevelopExpertRefDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(IndustrialDevelopExpertRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(IndustrialDevelopExpertRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(IndustrialDevelopExpertRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    IndustrialDevelopExpertRefDO selectByPrimaryKey(IndustrialDevelopExpertRefDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(IndustrialDevelopExpertRefDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_expert_ref
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(IndustrialDevelopExpertRefDO record);
}