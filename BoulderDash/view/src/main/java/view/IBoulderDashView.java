package view;

public interface IBoulderDashView {

	/**
	 * Display message.
	 * @param Message the message
	 */
	public void displayMessage(String Message);
	
	/**
	 * Refresh the number of diamonds left to collect
	 */
	 public void refreshDiamondToCollect();
}