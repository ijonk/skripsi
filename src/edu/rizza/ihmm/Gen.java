package edu.rizza.ihmm;

import java.util.ArrayList;
import java.util.List;

public class Gen {
	private Integer[] startCodon;
	private Integer[] stopCodon;
	private String[] codingRegion;
	private final List<Gen> genes = new ArrayList<Gen>();

	/*
	 * public void isComplete() { Iterator<Gen> iterator = genes.iterator();
	 * while (iterator.hasNext()) { if(genes.equals(stopCodon)){
	 * 
	 * }
	 * 
	 * }
	 */

	public boolean isCompete() {
		return stopCodon.length != 0;
	}

	// geter setter
	public Integer[] getStartCodon() {
		return startCodon;
	}

	public void setStartCodon(Integer[] startCodon) {
		this.startCodon = startCodon;
	}

	public Integer[] getStopCodon() {
		return stopCodon;
	}

	public void setStopCodon(Integer[] stopCodon) {
		this.stopCodon = stopCodon;
	}

	public String[] getCodingRegion() {
		return codingRegion;
	}

	public void setCodingRegion(String[] codingRegion) {
		this.codingRegion = codingRegion;
	}

	public List<Gen> getGenes() {
		return genes;
	}

}
