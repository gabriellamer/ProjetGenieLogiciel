import java.awt.EventQueue;

import ca.uqtr.gl.controllers.ControlleurClients;
import ca.uqtr.gl.ui.EcranGestionClient;

public class Main {	
	public static void main(String[] args) {			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcranGestionClient window = new EcranGestionClient();
					window.frmGestionClient.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
