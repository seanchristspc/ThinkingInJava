package com.sean.unit9.monster;

public class HorrorShow {
	static void u(Monster b){
		b.menace();
	}
	static void v(DangerousMonster d){
		d.menace();
		d.destroy();
	}
	static void w(Lethal l){
		l.kill();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DangerousMonster barney=new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad=new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}

}
