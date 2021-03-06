package com.googlegroups.searchenginebkhn.queryTemplate;

import java.util.LinkedList;
/**
 * 
 * @author nxhoaf
 * Lưu trữ tên và tập giá trị ứng với tên đó.
 *
 */
public class LabelValueSet 
{
	private String labelName;
	private LinkedList<String> valueSets;
	public LabelValueSet(String labelName)
	{
		this.labelName = labelName;
		this.valueSets = new LinkedList<String>();
	}
	public void addValue(String labelValue)
	{
		// chuan hoa bo ki tu space
		labelValue = labelValue.replace(' ', '+');
		valueSets.add(labelValue);
	}
	public String getLabelName()
	{
		return labelName;
	}
	/**
	 * Lay ve tap cac xau co dang label=value1, label=value2, label=valueN
	 * @return
	 */
	public LinkedList<String> getSetOfLabelValue()
	{
		LinkedList<String> set = new LinkedList<String>();
		for (String e : valueSets)
		{
			String member = labelName + "=" + e;
			set.add(member);
		}
		return set;
	}
}










