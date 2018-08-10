package com.sean.unit9.filters;

public class BandPass {
	double lowCutoff,highCutoff;
	public BandPass(double lowCutoff,double highCutoff){
		this.highCutoff=highCutoff;
		this.lowCutoff=lowCutoff;
	}
	public Waveform process(Waveform input){
		return input;
	}
}
