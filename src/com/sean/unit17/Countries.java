package com.sean.unit17;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Countries {
	
	public static String[][] DATA={
			//Africa
			{"ALGERIA","Algiers"},{"ANGOLA","Luanda"},
			{"BENIN","Porto-Novo"},{"BOTSWANA","Gaberone"},
			{"BURKINA FASO","Quagadougou"},{"BURUNDI","Bujumbura"},
			{"CAMEROON","Yaounde"},{"CAPE VERDE","Praia"},
			{"CENTRAL AFRICAN REPUBLIC","Bangui"},{"CHAD","N'djamena"},
			{"COMOROS","Moroni"},{"CONGO","Brazzaville"},
			{"DJBOUTI","Dijibouti"},{"EGUPT","Asmara"},
			{"ETHIOPIAL","Addis Ababa"},{"GABON","Libreville"},
			{"THE GAMBIA","Banjul"},{"GHANA","Accra"},
			{"GUINEA","Conakry"},{"BISSAU","Bissau"},
			{"COTE D'IVOIR(IVORY COAST)","Yamoussoukro"},{"KENYA","Nairobi"},
			{"LESOTHO","Maseru"},{"LIBERIA","Monrovia"},
			{"LIBYA","Tripoli"},{"MAURITIUS","Port Louis"},
			{"MOROCCO","Rabat"},{"MOZAMBIQUE","Maputo"},
			{"NAMIBIA","Windhoek"},{"NIGER","Niamey"},
			{"NIGERIA","Abja"},{"RWANDA","Kigali"},
			{"SAO TOME E PTINCIPE","Sao Tome"},{"SENGAL","Dakar"},
			{"SEYCHELLES","Victoria"},{"SSIERRA LEONE","Freetown"},
			{"SOMALIA","Mogadishu"},{"SOUTH AFRICA","Pretoria/Cape Town"},
			{"SUDAN","khartoum"},{"SWAZILAND","Mbabane"},
			{"TANXSNIA","Dodoma"},{"TOGO","Lome"},
			{"TUNISIA","Tunis"},{"UGANDA","Kampala"},
			{"DEMOCRATIC REPUBLIC OF THE CANGO(ZAIRE)","Kinshasa"},{"ZAMBIA","Lusaka"},
			{"ZIMBABWE","Harare"},
			
			//Asia
			{"AFGHANISTAN","Kabul"},{"BAHRAIN","Manama"},
			{"BANGADESH","Dhaka"},{"BHUTAN","Thimphu"},
			{"BRUNEI","Bandar Seri Begawan"},{"CAMBODIA","Phnom Penh"},
			{"CHINA","Beijing"},{"CYPRUS","Nicosia"},
			{"INDIA","New Delhi"},{"INDONESIA","Jakarta"},
			{"IRAN","Tehran"},{"IRAQ","Baghdad"},
			{"ISRAEL","Jerusalem"},{"JAPAN","Tokyo"},
			{"JORDAN","Amman"},{"KUWAIT","Kuwait City"},
			{"LAOS","Vientiane"},{"LEBANON","Beirut"},
			{"MALAYSIA","Kuala Lumpur"},{"THE MALDIVES","Male"},
			{"MONGOLIA","Ulan Bator"},{"MYANMAR (BURMA)","Rangoon"},
			{"NEPAL","Katmandu"},{"DEMOCRATIC PEOPLE'S REPUBLIC OF KOREA","P'yongyang"},
			{"OMAN","Muscat"},{"PAKISTAN","Islamabad"},
			{"PHILIPPINES","Manila"},{"QATAR","Doha"},
			{"SAUDI ARABIA","Riyadh"},{"SINGAPORE","Singapore"},
			{"REPUBLIC OF KOREA","Seoul"},{"SRI LANKA","Colombo"},
			{"SYRIA","Damascus"},{"THAILAND","Bnagkok"},
			{"TURKEY","Ankara"},{"UNITED ARAB EMIRATES","Abu Doha"},
			{"VIETNAM","Hanoi"},{"YEMEN","Sana'a"},
			
			//Australia and Oceania
			{"AUSTRALIA","Canbrra"},{"FIJI","Suva"},
			{"KIRIBATI","Bangkok"},{"MARSHALL","Dalap-Uliga-Darrit"},
			{"MICTONESIA","Palikir"},{"NAURU","Yaren"},
			{"NEW ZEALAND","Wellington"},{"PALAU","Koror"},
			{"PAPUA NEW GUINEA","Port Moresby"},{"SOLOMON ISLANDS","Honaira"},
			{"TONGA","Nuku'alofa"},{"TUVALU","Fongafale"},
			{"VANUATU","<Port-Vila>"},{"WESTERN SAMOA","Apia"},
			
			// Easter Europe and former USSR
			{"ARMENIA","Yerevan"},{"AZERBAIJAN","Baku"},
			{"BELARUS (BYELORUSSIA)","Minsk"},{"BULGARIA","Sofia"},
			{"GEORGIA","Tbilisi"},{"KAZAKSTAN","Almaty"},
			{"KYRGYZSTAN","Alma-Ata"},{"MOLDOVA","Chisinau"},
			{"RUSSIA","Moscow"},{"TAJIKISTAN","Dushanbe"},
			{"TURKMENISTAN","Ashkabad"},{"UKRAINE","Kyiv"},
			{"UZBEKISTAN","Tashkent"},
			
			//Europe
			{"ALBANIA","Tirana"},{"ANDORRA","Andorra la Vella"},
			{"AUSTRIA","Vienna"},{"BELGIUM","Brussels"},
			{"BOSNIA","-"},{"HERZEGOVINA","Sarajevo"},
			{"CROATIA","Zagreb"},{"CZECH REPBLIC","Prague"},
			{"DENMARK","Copenhagen"},{"ESTONIA","Tallinn"},
			{"FIANLAND","Helsinki"},{"FRANCE","Paris"},
			{"GERMANY","Berlin"},{"GREECE","Athens"},
			{"HUNGARY","Budapest"},{"ICELAND","Reykjavik"},
			{"IRELAND","Riga"},{"ITALY","Rome"},
			{"LATVIA","Riga"},{"LIECHTENSTEIN","Valletta"},
			{"MONACO","Monaco"},{"MONTENEGRO","Podgorica"},
			{"LITHUANIA","Vilnius"},{"LUXEMBOURG","Luxembourg"},
			{"MACEDONIA","Skopje"},{"MALTA","Valletta"},
			{"THE NETHERLANDS","Amsterdam"},{"NORWAY","Oslo"},
			{"POLAND","Warsaw"},{"PORTUGAL","Lisbon"},
			{"ROMANIA","Bucharest"},{"SAN MARINO","San Marino"},
			{"SERBIA","Bucharest"},{"SLOVAKIA","Bratislava"},
			{"SLOVENIA","Ljuijana"},{"SPAIN","Madrid"},
			{"SWEDEN","Stockholm"},{"SWITZERLAND","Berne"},
			{"UNITED KINDOM","London"},{"VATICAN CITY","---"},
			
			//North and Central America
			{"ANTIGUA AND BARUDA","Saint John's"},{"BAHAMAS","Nassau"},
			{"BARBADOS","Bridgetown"},{"BELIZE","Belmopan"},
			{"CANADA","Ottawa"},{"COSTA RICA","San Jose"},
			{"CUBA","Havana"},{"DOMINICA","Roseau"},
			{"DOMINCAN REPUBLIC","San Salvador"},{"EL SALVADOR","San Salvador"},
			{"GRENADA","Saint George's"},{"GUATEMALA","Guatemala City"},
			{"HAITI","Port-au-Prince"},{"HONDURAS","Tegucigalpa"},
			{"JAMAICA","Kingston"},{"MEXICO","Mexico City"},
			{"NICARAGUA","Managua"},{"PANAMA","Panama City"},
			{"ST.LUCIA","Castries"},{"ST.KISS","-"},
			{"NEVIS","Brasilia"},{"ST.VINCENT AND THE GERNADINES","Kingstown"},
			{"UNITED STATES OF AMERICA","Washington,D.C."},
			
			// South America
			{"ARGETINA","Buenos Aires"},{"BOLIVIA","Sucre(legal)/La Paz(administrative)"},
			{"BRAZIL","Brasilia"},{"CHILE","Santiago"},
			{"COLOMBIA","Bogota"},{"ECUADOR","Quito"},
			{"GUYANA","Georgetown"},{"PARAGUAY","Asuncion"},
			{"PERU","Lima"},{"SURINAME","Paramaribo"},
			{"TRINIDAD AND TOBAGO","Port of Spain"},{"URUGUAY","Montevideo"},
			{"VENEZUELA","Caracas"},
			
	};
	
	
	// Use AbstractMap by implementing entrySet()
	
	private static class FlyweightMap
	extends AbstractMap<String, String>{
		
		
		private static class Entry
		implements Map.Entry<String, String>{
			int index;
			Entry(int index) {
				// TODO Auto-generated constructor stub
				this.index=index;
			}
			public boolean equals(Object o){
				return DATA[index][0].equals(o);
			}
			@Override
			public String getKey() {
				// TODO Auto-generated method stub
				return DATA[index][0];
			}

			@Override
			public String getValue() {
				// TODO Auto-generated method stub
				return DATA[index][1];
			}

			@Override
			public String setValue(String value) {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
			
			public int hashCode(){
				return DATA[index][0].hashCode();
			}
			
		}
		
		
		//Use AbstractSet by implemeting size() & iterator()
		
		static class EntrySet
		extends AbstractSet<Map.Entry<String, String>>{

			private int size;
			EntrySet(int size) {
				if(size<0)
					this.size=0;
				// Can't be any bigger than the array
				else if(size>DATA.length)
					this.size=DATA.length;
				else
					this.size=size;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return size;
			}
			
			private class Iter
			implements Iterator<Map.Entry<String, String>>{
				//Only one Entry object per Iterator
				private Entry entry=new Entry(-1);
				
				@Override
				public boolean hasNext() {
					// TODO Auto-generated method stub
					return entry.index<size-1;
				}

				@Override
				public java.util.Map.Entry<String, String> next() {
					// TODO Auto-generated method stub
					entry.index++;
					return entry;
				}
				public void remove(){
					throw new UnsupportedOperationException();
				}
				
			}
			
			@Override
			public Iterator<java.util.Map.Entry<String, String>> iterator() {
				// TODO Auto-generated method stub
				return new Iter();
			}
			
		}
		
		private static Set<Map.Entry<String, String>> entries=new EntrySet(DATA.length);
		

		@Override
		public Set<java.util.Map.Entry<String, String>> entrySet() {
			
			return entries;
		}
		
	}
	
	
	// Create a partial map of 'size' countries:
	static Map<String,String> select(final int size){
		return new FlyweightMap(){
			public Set<Map.Entry<String, String>> entrySet(){
				return new EntrySet(size);
			}
		};
	}
	
	static Map<String,String> map=new FlyweightMap();
	
	public static Map<String,String> capitals(){
		return map;	//The entire map
	}
	
	public static Map<String,String> capitals(int size){
		return select(size);	//A partial map
	}
	
	static List<String> names=new ArrayList<String>(map.keySet());
	
	//All the name
	public static List<String> names(){
		return names;
	}
	
	// A partial list
	public static List<String> names(int size){
		return new ArrayList<String>(select(size).keySet());
	}
	
	public static void main(String[] args){
		System.out.println(capitals(10));
	}
	
}
