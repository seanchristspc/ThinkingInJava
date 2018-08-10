package com.sean.unit15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob{}
class Fnokle{}
class Quark<Q>{}
class Particle<POSITION,MOMENTUM>{}
/**
 * 
 * 在泛型代码内部，无法获得任何有关泛型参数类型的信息
 * @author sean
 *
 */
public class LostInformation {

	public static void main(String[] args) {
		List<Frob> list=new ArrayList<Frob>();
		Map<Frob, Fnokle> map=new HashMap<Frob, Fnokle>();
		Quark<Fnokle> quark=new Quark<Fnokle>();
		Particle<Long,Double> p=new Particle<Long,Double>();
		System.out.println(Arrays.toString(
				list.getClass().getTypeParameters()));
		
		System.out.println(Arrays.toString(
				map.getClass().getTypeParameters()));
		
		System.out.println(Arrays.toString(
				quark.getClass().getTypeParameters()));
		
		System.out.println(Arrays.toString(
				p.getClass().getTypeParameters()));
		
		
	}

}
