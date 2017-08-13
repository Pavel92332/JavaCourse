package controller;

import controller.interfaces.MyController;
import model.TextModel;
import view.MyView;
import view.MyViewImpl;

/**An implementation of MyController
 * 
 * @author Ilya Falko
 *
 */
public class MyControllerImpl implements MyController {

	private TextModel model;

	public MyControllerImpl() {
		super();
	}
	public MyControllerImpl(TextModel m) {
		super();
		this.model = m;
	}
	
	public TextModel getModel() {
		return model;
	}

	public void setModel(TextModel model) {
		this.model = model;
	}

	/**
	 * method, related to the "OK" button
	 */
	public void ok() {
		ControllerManager manager = ControllerManager.getInstance();
		
		//asking ControllerManager for a view, related to this controller
		MyView view = manager.getView();
		//getting data from the view and saving it in model
		model.setText(view.getTextArea().getText());
		//printing of the confirmation into console
		System.out.println("ok pressed. Saved text: "+ model.getText());
	}
	
}
