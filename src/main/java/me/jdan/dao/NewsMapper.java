package me.jdan.dao;

import java.util.List;
import me.jdan.po.News;
import me.jdan.po.NewsExample;
import me.jdan.po.ShortNews;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int countByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int deleteByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int deleteByPrimaryKey(String newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int insert(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int insertSelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    List<News> selectByExample(NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    News selectByPrimaryKey(String newsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByPrimaryKeySelective(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(News record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
     *
     * @mbggenerated Mon Oct 31 20:34:54 CST 2016
     */
    int updateByPrimaryKey(News record);


    /*
    * this is created by author
    * */
    List<ShortNews> selectAllShortNews();

    List<ShortNews> selectAllPublicShortNews();

    List<ShortNews> selectAllShortNewsByCategoryId(int id);

    List<ShortNews> selectAllPublicShortNewsByCategoryId(int id);
}