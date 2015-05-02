package com.HP.WSTest;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="myPropBean")
public class MyProp {
	public List<MyPropType> myPropList = new ArrayList<MyPropType>();
	
	public MyProp() {
	}
	
}

