package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CxsCustomerEmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CxsCustomerEmpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andApplyCodeIsNull() {
            addCriterion("APPLY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIsNotNull() {
            addCriterion("APPLY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCodeEqualTo(String value) {
            addCriterion("APPLY_CODE =", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotEqualTo(String value) {
            addCriterion("APPLY_CODE <>", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThan(String value) {
            addCriterion("APPLY_CODE >", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE >=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThan(String value) {
            addCriterion("APPLY_CODE <", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_CODE <=", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeLike(String value) {
            addCriterion("APPLY_CODE like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotLike(String value) {
            addCriterion("APPLY_CODE not like", value, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeIn(List<String> values) {
            addCriterion("APPLY_CODE in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotIn(List<String> values) {
            addCriterion("APPLY_CODE not in", values, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_CODE between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andApplyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_CODE not between", value1, value2, "applyCode");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNull() {
            addCriterion("COMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNotNull() {
            addCriterion("COMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompNameEqualTo(String value) {
            addCriterion("COMP_NAME =", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotEqualTo(String value) {
            addCriterion("COMP_NAME <>", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThan(String value) {
            addCriterion("COMP_NAME >", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_NAME >=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThan(String value) {
            addCriterion("COMP_NAME <", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThanOrEqualTo(String value) {
            addCriterion("COMP_NAME <=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLike(String value) {
            addCriterion("COMP_NAME like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotLike(String value) {
            addCriterion("COMP_NAME not like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameIn(List<String> values) {
            addCriterion("COMP_NAME in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotIn(List<String> values) {
            addCriterion("COMP_NAME not in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameBetween(String value1, String value2) {
            addCriterion("COMP_NAME between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotBetween(String value1, String value2) {
            addCriterion("COMP_NAME not between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceIsNull() {
            addCriterion("COMP_ADDR_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceIsNotNull() {
            addCriterion("COMP_ADDR_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceEqualTo(String value) {
            addCriterion("COMP_ADDR_PROVINCE =", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceNotEqualTo(String value) {
            addCriterion("COMP_ADDR_PROVINCE <>", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceGreaterThan(String value) {
            addCriterion("COMP_ADDR_PROVINCE >", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_PROVINCE >=", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceLessThan(String value) {
            addCriterion("COMP_ADDR_PROVINCE <", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_PROVINCE <=", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceLike(String value) {
            addCriterion("COMP_ADDR_PROVINCE like", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceNotLike(String value) {
            addCriterion("COMP_ADDR_PROVINCE not like", value, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceIn(List<String> values) {
            addCriterion("COMP_ADDR_PROVINCE in", values, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceNotIn(List<String> values) {
            addCriterion("COMP_ADDR_PROVINCE not in", values, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_PROVINCE between", value1, value2, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrProvinceNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_PROVINCE not between", value1, value2, "compAddrProvince");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityIsNull() {
            addCriterion("COMP_ADDR_CITY is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityIsNotNull() {
            addCriterion("COMP_ADDR_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityEqualTo(String value) {
            addCriterion("COMP_ADDR_CITY =", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityNotEqualTo(String value) {
            addCriterion("COMP_ADDR_CITY <>", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityGreaterThan(String value) {
            addCriterion("COMP_ADDR_CITY >", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_CITY >=", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityLessThan(String value) {
            addCriterion("COMP_ADDR_CITY <", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_CITY <=", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityLike(String value) {
            addCriterion("COMP_ADDR_CITY like", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityNotLike(String value) {
            addCriterion("COMP_ADDR_CITY not like", value, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityIn(List<String> values) {
            addCriterion("COMP_ADDR_CITY in", values, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityNotIn(List<String> values) {
            addCriterion("COMP_ADDR_CITY not in", values, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_CITY between", value1, value2, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrCityNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_CITY not between", value1, value2, "compAddrCity");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictIsNull() {
            addCriterion("COMP_ADDR_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictIsNotNull() {
            addCriterion("COMP_ADDR_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictEqualTo(String value) {
            addCriterion("COMP_ADDR_DISTRICT =", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictNotEqualTo(String value) {
            addCriterion("COMP_ADDR_DISTRICT <>", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictGreaterThan(String value) {
            addCriterion("COMP_ADDR_DISTRICT >", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_DISTRICT >=", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictLessThan(String value) {
            addCriterion("COMP_ADDR_DISTRICT <", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDR_DISTRICT <=", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictLike(String value) {
            addCriterion("COMP_ADDR_DISTRICT like", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictNotLike(String value) {
            addCriterion("COMP_ADDR_DISTRICT not like", value, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictIn(List<String> values) {
            addCriterion("COMP_ADDR_DISTRICT in", values, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictNotIn(List<String> values) {
            addCriterion("COMP_ADDR_DISTRICT not in", values, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_DISTRICT between", value1, value2, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompAddrDistrictNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDR_DISTRICT not between", value1, value2, "compAddrDistrict");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressIsNull() {
            addCriterion("COMP_DETAIL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressIsNotNull() {
            addCriterion("COMP_DETAIL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressEqualTo(String value) {
            addCriterion("COMP_DETAIL_ADDRESS =", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressNotEqualTo(String value) {
            addCriterion("COMP_DETAIL_ADDRESS <>", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressGreaterThan(String value) {
            addCriterion("COMP_DETAIL_ADDRESS >", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_DETAIL_ADDRESS >=", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressLessThan(String value) {
            addCriterion("COMP_DETAIL_ADDRESS <", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("COMP_DETAIL_ADDRESS <=", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressLike(String value) {
            addCriterion("COMP_DETAIL_ADDRESS like", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressNotLike(String value) {
            addCriterion("COMP_DETAIL_ADDRESS not like", value, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressIn(List<String> values) {
            addCriterion("COMP_DETAIL_ADDRESS in", values, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressNotIn(List<String> values) {
            addCriterion("COMP_DETAIL_ADDRESS not in", values, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressBetween(String value1, String value2) {
            addCriterion("COMP_DETAIL_ADDRESS between", value1, value2, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompDetailAddressNotBetween(String value1, String value2) {
            addCriterion("COMP_DETAIL_ADDRESS not between", value1, value2, "compDetailAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressIsNull() {
            addCriterion("COMP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCompAddressIsNotNull() {
            addCriterion("COMP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddressEqualTo(String value) {
            addCriterion("COMP_ADDRESS =", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotEqualTo(String value) {
            addCriterion("COMP_ADDRESS <>", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressGreaterThan(String value) {
            addCriterion("COMP_ADDRESS >", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ADDRESS >=", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLessThan(String value) {
            addCriterion("COMP_ADDRESS <", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLessThanOrEqualTo(String value) {
            addCriterion("COMP_ADDRESS <=", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLike(String value) {
            addCriterion("COMP_ADDRESS like", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotLike(String value) {
            addCriterion("COMP_ADDRESS not like", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressIn(List<String> values) {
            addCriterion("COMP_ADDRESS in", values, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotIn(List<String> values) {
            addCriterion("COMP_ADDRESS not in", values, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressBetween(String value1, String value2) {
            addCriterion("COMP_ADDRESS between", value1, value2, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotBetween(String value1, String value2) {
            addCriterion("COMP_ADDRESS not between", value1, value2, "compAddress");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1IsNull() {
            addCriterion("GSW_COMP_PHONE1 is null");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1IsNotNull() {
            addCriterion("GSW_COMP_PHONE1 is not null");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1EqualTo(String value) {
            addCriterion("GSW_COMP_PHONE1 =", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1NotEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE1 <>", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1GreaterThan(String value) {
            addCriterion("GSW_COMP_PHONE1 >", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE1 >=", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1LessThan(String value) {
            addCriterion("GSW_COMP_PHONE1 <", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1LessThanOrEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE1 <=", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1Like(String value) {
            addCriterion("GSW_COMP_PHONE1 like", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1NotLike(String value) {
            addCriterion("GSW_COMP_PHONE1 not like", value, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1In(List<String> values) {
            addCriterion("GSW_COMP_PHONE1 in", values, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1NotIn(List<String> values) {
            addCriterion("GSW_COMP_PHONE1 not in", values, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1Between(String value1, String value2) {
            addCriterion("GSW_COMP_PHONE1 between", value1, value2, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone1NotBetween(String value1, String value2) {
            addCriterion("GSW_COMP_PHONE1 not between", value1, value2, "gswCompPhone1");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2IsNull() {
            addCriterion("GSW_COMP_PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2IsNotNull() {
            addCriterion("GSW_COMP_PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2EqualTo(String value) {
            addCriterion("GSW_COMP_PHONE2 =", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2NotEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE2 <>", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2GreaterThan(String value) {
            addCriterion("GSW_COMP_PHONE2 >", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE2 >=", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2LessThan(String value) {
            addCriterion("GSW_COMP_PHONE2 <", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2LessThanOrEqualTo(String value) {
            addCriterion("GSW_COMP_PHONE2 <=", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2Like(String value) {
            addCriterion("GSW_COMP_PHONE2 like", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2NotLike(String value) {
            addCriterion("GSW_COMP_PHONE2 not like", value, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2In(List<String> values) {
            addCriterion("GSW_COMP_PHONE2 in", values, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2NotIn(List<String> values) {
            addCriterion("GSW_COMP_PHONE2 not in", values, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2Between(String value1, String value2) {
            addCriterion("GSW_COMP_PHONE2 between", value1, value2, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andGswCompPhone2NotBetween(String value1, String value2) {
            addCriterion("GSW_COMP_PHONE2 not between", value1, value2, "gswCompPhone2");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneIsNull() {
            addCriterion("STANDBY_COMP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneIsNotNull() {
            addCriterion("STANDBY_COMP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneEqualTo(String value) {
            addCriterion("STANDBY_COMP_PHONE =", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneNotEqualTo(String value) {
            addCriterion("STANDBY_COMP_PHONE <>", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneGreaterThan(String value) {
            addCriterion("STANDBY_COMP_PHONE >", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STANDBY_COMP_PHONE >=", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneLessThan(String value) {
            addCriterion("STANDBY_COMP_PHONE <", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneLessThanOrEqualTo(String value) {
            addCriterion("STANDBY_COMP_PHONE <=", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneLike(String value) {
            addCriterion("STANDBY_COMP_PHONE like", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneNotLike(String value) {
            addCriterion("STANDBY_COMP_PHONE not like", value, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneIn(List<String> values) {
            addCriterion("STANDBY_COMP_PHONE in", values, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneNotIn(List<String> values) {
            addCriterion("STANDBY_COMP_PHONE not in", values, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneBetween(String value1, String value2) {
            addCriterion("STANDBY_COMP_PHONE between", value1, value2, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andStandbyCompPhoneNotBetween(String value1, String value2) {
            addCriterion("STANDBY_COMP_PHONE not between", value1, value2, "standbyCompPhone");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("CREATED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("CREATED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(String value) {
            addCriterion("CREATED_USER_ID =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(String value) {
            addCriterion("CREATED_USER_ID <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(String value) {
            addCriterion("CREATED_USER_ID >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_ID >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(String value) {
            addCriterion("CREATED_USER_ID <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_ID <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLike(String value) {
            addCriterion("CREATED_USER_ID like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotLike(String value) {
            addCriterion("CREATED_USER_ID not like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<String> values) {
            addCriterion("CREATED_USER_ID in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<String> values) {
            addCriterion("CREATED_USER_ID not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(String value1, String value2) {
            addCriterion("CREATED_USER_ID between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER_ID not between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIsNull() {
            addCriterion("CREATED_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIsNotNull() {
            addCriterion("CREATED_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameEqualTo(String value) {
            addCriterion("CREATED_USER_NAME =", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotEqualTo(String value) {
            addCriterion("CREATED_USER_NAME <>", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameGreaterThan(String value) {
            addCriterion("CREATED_USER_NAME >", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_NAME >=", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLessThan(String value) {
            addCriterion("CREATED_USER_NAME <", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLessThanOrEqualTo(String value) {
            addCriterion("CREATED_USER_NAME <=", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameLike(String value) {
            addCriterion("CREATED_USER_NAME like", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotLike(String value) {
            addCriterion("CREATED_USER_NAME not like", value, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameIn(List<String> values) {
            addCriterion("CREATED_USER_NAME in", values, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotIn(List<String> values) {
            addCriterion("CREATED_USER_NAME not in", values, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameBetween(String value1, String value2) {
            addCriterion("CREATED_USER_NAME between", value1, value2, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNameNotBetween(String value1, String value2) {
            addCriterion("CREATED_USER_NAME not between", value1, value2, "createdUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNull() {
            addCriterion("UPDATED_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNotNull() {
            addCriterion("UPDATED_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdEqualTo(String value) {
            addCriterion("UPDATED_USER_ID =", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotEqualTo(String value) {
            addCriterion("UPDATED_USER_ID <>", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThan(String value) {
            addCriterion("UPDATED_USER_ID >", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER_ID >=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThan(String value) {
            addCriterion("UPDATED_USER_ID <", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER_ID <=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLike(String value) {
            addCriterion("UPDATED_USER_ID like", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotLike(String value) {
            addCriterion("UPDATED_USER_ID not like", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIn(List<String> values) {
            addCriterion("UPDATED_USER_ID in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotIn(List<String> values) {
            addCriterion("UPDATED_USER_ID not in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdBetween(String value1, String value2) {
            addCriterion("UPDATED_USER_ID between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotBetween(String value1, String value2) {
            addCriterion("UPDATED_USER_ID not between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameIsNull() {
            addCriterion("UPDATED_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameIsNotNull() {
            addCriterion("UPDATED_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameEqualTo(String value) {
            addCriterion("UPDATED_USER_NAME =", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameNotEqualTo(String value) {
            addCriterion("UPDATED_USER_NAME <>", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameGreaterThan(String value) {
            addCriterion("UPDATED_USER_NAME >", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER_NAME >=", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameLessThan(String value) {
            addCriterion("UPDATED_USER_NAME <", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_USER_NAME <=", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameLike(String value) {
            addCriterion("UPDATED_USER_NAME like", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameNotLike(String value) {
            addCriterion("UPDATED_USER_NAME not like", value, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameIn(List<String> values) {
            addCriterion("UPDATED_USER_NAME in", values, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameNotIn(List<String> values) {
            addCriterion("UPDATED_USER_NAME not in", values, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameBetween(String value1, String value2) {
            addCriterion("UPDATED_USER_NAME between", value1, value2, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserNameNotBetween(String value1, String value2) {
            addCriterion("UPDATED_USER_NAME not between", value1, value2, "updatedUserName");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("CC is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("CC is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(String value) {
            addCriterion("CC =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(String value) {
            addCriterion("CC <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(String value) {
            addCriterion("CC >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(String value) {
            addCriterion("CC >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(String value) {
            addCriterion("CC <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(String value) {
            addCriterion("CC <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLike(String value) {
            addCriterion("CC like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotLike(String value) {
            addCriterion("CC not like", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<String> values) {
            addCriterion("CC in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<String> values) {
            addCriterion("CC not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(String value1, String value2) {
            addCriterion("CC between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(String value1, String value2) {
            addCriterion("CC not between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andOcIsNull() {
            addCriterion("OC is null");
            return (Criteria) this;
        }

        public Criteria andOcIsNotNull() {
            addCriterion("OC is not null");
            return (Criteria) this;
        }

        public Criteria andOcEqualTo(String value) {
            addCriterion("OC =", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotEqualTo(String value) {
            addCriterion("OC <>", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThan(String value) {
            addCriterion("OC >", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcGreaterThanOrEqualTo(String value) {
            addCriterion("OC >=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThan(String value) {
            addCriterion("OC <", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLessThanOrEqualTo(String value) {
            addCriterion("OC <=", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcLike(String value) {
            addCriterion("OC like", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotLike(String value) {
            addCriterion("OC not like", value, "oc");
            return (Criteria) this;
        }

        public Criteria andOcIn(List<String> values) {
            addCriterion("OC in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotIn(List<String> values) {
            addCriterion("OC not in", values, "oc");
            return (Criteria) this;
        }

        public Criteria andOcBetween(String value1, String value2) {
            addCriterion("OC between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andOcNotBetween(String value1, String value2) {
            addCriterion("OC not between", value1, value2, "oc");
            return (Criteria) this;
        }

        public Criteria andCcDescIsNull() {
            addCriterion("CC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCcDescIsNotNull() {
            addCriterion("CC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCcDescEqualTo(String value) {
            addCriterion("CC_DESC =", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescNotEqualTo(String value) {
            addCriterion("CC_DESC <>", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescGreaterThan(String value) {
            addCriterion("CC_DESC >", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescGreaterThanOrEqualTo(String value) {
            addCriterion("CC_DESC >=", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescLessThan(String value) {
            addCriterion("CC_DESC <", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescLessThanOrEqualTo(String value) {
            addCriterion("CC_DESC <=", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescLike(String value) {
            addCriterion("CC_DESC like", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescNotLike(String value) {
            addCriterion("CC_DESC not like", value, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescIn(List<String> values) {
            addCriterion("CC_DESC in", values, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescNotIn(List<String> values) {
            addCriterion("CC_DESC not in", values, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescBetween(String value1, String value2) {
            addCriterion("CC_DESC between", value1, value2, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andCcDescNotBetween(String value1, String value2) {
            addCriterion("CC_DESC not between", value1, value2, "ccDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescIsNull() {
            addCriterion("OC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOcDescIsNotNull() {
            addCriterion("OC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOcDescEqualTo(String value) {
            addCriterion("OC_DESC =", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescNotEqualTo(String value) {
            addCriterion("OC_DESC <>", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescGreaterThan(String value) {
            addCriterion("OC_DESC >", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescGreaterThanOrEqualTo(String value) {
            addCriterion("OC_DESC >=", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescLessThan(String value) {
            addCriterion("OC_DESC <", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescLessThanOrEqualTo(String value) {
            addCriterion("OC_DESC <=", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescLike(String value) {
            addCriterion("OC_DESC like", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescNotLike(String value) {
            addCriterion("OC_DESC not like", value, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescIn(List<String> values) {
            addCriterion("OC_DESC in", values, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescNotIn(List<String> values) {
            addCriterion("OC_DESC not in", values, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescBetween(String value1, String value2) {
            addCriterion("OC_DESC between", value1, value2, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOcDescNotBetween(String value1, String value2) {
            addCriterion("OC_DESC not between", value1, value2, "ocDesc");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIsNull() {
            addCriterion("OCCUPATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIsNotNull() {
            addCriterion("OCCUPATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeEqualTo(String value) {
            addCriterion("OCCUPATION_TYPE =", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotEqualTo(String value) {
            addCriterion("OCCUPATION_TYPE <>", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeGreaterThan(String value) {
            addCriterion("OCCUPATION_TYPE >", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OCCUPATION_TYPE >=", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLessThan(String value) {
            addCriterion("OCCUPATION_TYPE <", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLessThanOrEqualTo(String value) {
            addCriterion("OCCUPATION_TYPE <=", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeLike(String value) {
            addCriterion("OCCUPATION_TYPE like", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotLike(String value) {
            addCriterion("OCCUPATION_TYPE not like", value, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeIn(List<String> values) {
            addCriterion("OCCUPATION_TYPE in", values, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotIn(List<String> values) {
            addCriterion("OCCUPATION_TYPE not in", values, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeBetween(String value1, String value2) {
            addCriterion("OCCUPATION_TYPE between", value1, value2, "occupationType");
            return (Criteria) this;
        }

        public Criteria andOccupationTypeNotBetween(String value1, String value2) {
            addCriterion("OCCUPATION_TYPE not between", value1, value2, "occupationType");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1IsNull() {
            addCriterion("RECOMMEND_CC1 is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1IsNotNull() {
            addCriterion("RECOMMEND_CC1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1EqualTo(String value) {
            addCriterion("RECOMMEND_CC1 =", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1NotEqualTo(String value) {
            addCriterion("RECOMMEND_CC1 <>", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1GreaterThan(String value) {
            addCriterion("RECOMMEND_CC1 >", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1GreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC1 >=", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1LessThan(String value) {
            addCriterion("RECOMMEND_CC1 <", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1LessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC1 <=", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1Like(String value) {
            addCriterion("RECOMMEND_CC1 like", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1NotLike(String value) {
            addCriterion("RECOMMEND_CC1 not like", value, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1In(List<String> values) {
            addCriterion("RECOMMEND_CC1 in", values, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1NotIn(List<String> values) {
            addCriterion("RECOMMEND_CC1 not in", values, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1Between(String value1, String value2) {
            addCriterion("RECOMMEND_CC1 between", value1, value2, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1NotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC1 not between", value1, value2, "recommendCc1");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescIsNull() {
            addCriterion("RECOMMEND_CC1_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescIsNotNull() {
            addCriterion("RECOMMEND_CC1_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescEqualTo(String value) {
            addCriterion("RECOMMEND_CC1_DESC =", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescNotEqualTo(String value) {
            addCriterion("RECOMMEND_CC1_DESC <>", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescGreaterThan(String value) {
            addCriterion("RECOMMEND_CC1_DESC >", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC1_DESC >=", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescLessThan(String value) {
            addCriterion("RECOMMEND_CC1_DESC <", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC1_DESC <=", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescLike(String value) {
            addCriterion("RECOMMEND_CC1_DESC like", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescNotLike(String value) {
            addCriterion("RECOMMEND_CC1_DESC not like", value, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescIn(List<String> values) {
            addCriterion("RECOMMEND_CC1_DESC in", values, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescNotIn(List<String> values) {
            addCriterion("RECOMMEND_CC1_DESC not in", values, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC1_DESC between", value1, value2, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc1DescNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC1_DESC not between", value1, value2, "recommendCc1Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2IsNull() {
            addCriterion("RECOMMEND_CC2 is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2IsNotNull() {
            addCriterion("RECOMMEND_CC2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2EqualTo(String value) {
            addCriterion("RECOMMEND_CC2 =", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2NotEqualTo(String value) {
            addCriterion("RECOMMEND_CC2 <>", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2GreaterThan(String value) {
            addCriterion("RECOMMEND_CC2 >", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2GreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC2 >=", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2LessThan(String value) {
            addCriterion("RECOMMEND_CC2 <", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2LessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC2 <=", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2Like(String value) {
            addCriterion("RECOMMEND_CC2 like", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2NotLike(String value) {
            addCriterion("RECOMMEND_CC2 not like", value, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2In(List<String> values) {
            addCriterion("RECOMMEND_CC2 in", values, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2NotIn(List<String> values) {
            addCriterion("RECOMMEND_CC2 not in", values, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2Between(String value1, String value2) {
            addCriterion("RECOMMEND_CC2 between", value1, value2, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2NotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC2 not between", value1, value2, "recommendCc2");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescIsNull() {
            addCriterion("RECOMMEND_CC2_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescIsNotNull() {
            addCriterion("RECOMMEND_CC2_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescEqualTo(String value) {
            addCriterion("RECOMMEND_CC2_DESC =", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescNotEqualTo(String value) {
            addCriterion("RECOMMEND_CC2_DESC <>", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescGreaterThan(String value) {
            addCriterion("RECOMMEND_CC2_DESC >", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC2_DESC >=", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescLessThan(String value) {
            addCriterion("RECOMMEND_CC2_DESC <", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC2_DESC <=", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescLike(String value) {
            addCriterion("RECOMMEND_CC2_DESC like", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescNotLike(String value) {
            addCriterion("RECOMMEND_CC2_DESC not like", value, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescIn(List<String> values) {
            addCriterion("RECOMMEND_CC2_DESC in", values, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescNotIn(List<String> values) {
            addCriterion("RECOMMEND_CC2_DESC not in", values, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC2_DESC between", value1, value2, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc2DescNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC2_DESC not between", value1, value2, "recommendCc2Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3IsNull() {
            addCriterion("RECOMMEND_CC3 is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3IsNotNull() {
            addCriterion("RECOMMEND_CC3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3EqualTo(String value) {
            addCriterion("RECOMMEND_CC3 =", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3NotEqualTo(String value) {
            addCriterion("RECOMMEND_CC3 <>", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3GreaterThan(String value) {
            addCriterion("RECOMMEND_CC3 >", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3GreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC3 >=", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3LessThan(String value) {
            addCriterion("RECOMMEND_CC3 <", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3LessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC3 <=", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3Like(String value) {
            addCriterion("RECOMMEND_CC3 like", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3NotLike(String value) {
            addCriterion("RECOMMEND_CC3 not like", value, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3In(List<String> values) {
            addCriterion("RECOMMEND_CC3 in", values, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3NotIn(List<String> values) {
            addCriterion("RECOMMEND_CC3 not in", values, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3Between(String value1, String value2) {
            addCriterion("RECOMMEND_CC3 between", value1, value2, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3NotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC3 not between", value1, value2, "recommendCc3");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescIsNull() {
            addCriterion("RECOMMEND_CC3_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescIsNotNull() {
            addCriterion("RECOMMEND_CC3_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescEqualTo(String value) {
            addCriterion("RECOMMEND_CC3_DESC =", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescNotEqualTo(String value) {
            addCriterion("RECOMMEND_CC3_DESC <>", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescGreaterThan(String value) {
            addCriterion("RECOMMEND_CC3_DESC >", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC3_DESC >=", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescLessThan(String value) {
            addCriterion("RECOMMEND_CC3_DESC <", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescLessThanOrEqualTo(String value) {
            addCriterion("RECOMMEND_CC3_DESC <=", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescLike(String value) {
            addCriterion("RECOMMEND_CC3_DESC like", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescNotLike(String value) {
            addCriterion("RECOMMEND_CC3_DESC not like", value, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescIn(List<String> values) {
            addCriterion("RECOMMEND_CC3_DESC in", values, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescNotIn(List<String> values) {
            addCriterion("RECOMMEND_CC3_DESC not in", values, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC3_DESC between", value1, value2, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andRecommendCc3DescNotBetween(String value1, String value2) {
            addCriterion("RECOMMEND_CC3_DESC not between", value1, value2, "recommendCc3Desc");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIsNull() {
            addCriterion("COMP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIsNotNull() {
            addCriterion("COMP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneEqualTo(String value) {
            addCriterion("COMP_PHONE =", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotEqualTo(String value) {
            addCriterion("COMP_PHONE <>", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneGreaterThan(String value) {
            addCriterion("COMP_PHONE >", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PHONE >=", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLessThan(String value) {
            addCriterion("COMP_PHONE <", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMP_PHONE <=", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLike(String value) {
            addCriterion("COMP_PHONE like", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotLike(String value) {
            addCriterion("COMP_PHONE not like", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIn(List<String> values) {
            addCriterion("COMP_PHONE in", values, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotIn(List<String> values) {
            addCriterion("COMP_PHONE not in", values, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneBetween(String value1, String value2) {
            addCriterion("COMP_PHONE between", value1, value2, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotBetween(String value1, String value2) {
            addCriterion("COMP_PHONE not between", value1, value2, "compPhone");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("DEPT =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("DEPT >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("DEPT <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("DEPT like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("DEPT not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("DEPT in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementIsNull() {
            addCriterion("COMP_PHONE_SUPPLEMENT is null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementIsNotNull() {
            addCriterion("COMP_PHONE_SUPPLEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementEqualTo(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT =", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementNotEqualTo(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT <>", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementGreaterThan(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT >", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT >=", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementLessThan(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT <", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementLessThanOrEqualTo(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT <=", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementLike(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT like", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementNotLike(String value) {
            addCriterion("COMP_PHONE_SUPPLEMENT not like", value, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementIn(List<String> values) {
            addCriterion("COMP_PHONE_SUPPLEMENT in", values, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementNotIn(List<String> values) {
            addCriterion("COMP_PHONE_SUPPLEMENT not in", values, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementBetween(String value1, String value2) {
            addCriterion("COMP_PHONE_SUPPLEMENT between", value1, value2, "compPhoneSupplement");
            return (Criteria) this;
        }

        public Criteria andCompPhoneSupplementNotBetween(String value1, String value2) {
            addCriterion("COMP_PHONE_SUPPLEMENT not between", value1, value2, "compPhoneSupplement");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}