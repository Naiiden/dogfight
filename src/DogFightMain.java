import dogfightControler.DogFightController;
import dogfightModel.DogfightModel;
import dogfightView.DogfightView;
import dogfightView.IViewSystem;

public class DogFightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogFightController dogfightController = new DogFightController(dogfightModel);
		final IViewSystem dogfightView = (IViewSystem) new DogfightView(dogfightController, dogfightModel,
		dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
		
	}

}
