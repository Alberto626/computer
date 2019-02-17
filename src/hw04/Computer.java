package hw04;

public class Computer {
	private Case towerCase;
	private Monitor monitor;
	private CPU cpu;
	private VideoCard videoCard;
	private HardDrive hardDrive;
	private Memory memory;
	
	public Computer(Case towerCase, Monitor monitor, CPU cpu, VideoCard videoCard, HardDrive hardDrive, Memory memory) {
		this.towerCase = towerCase;
		this.monitor = monitor;
		this.cpu = cpu;
		this.videoCard = videoCard;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}
	public Case getCase() {
		return towerCase;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public CPU getCPU() {
		return cpu;
	}
	public VideoCard getVideoCard() {
		return videoCard;
	}
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public double getTotalCost() { // get total cost value
		return 0;
	}
	public void displayReceipt() {
		
	}
}
