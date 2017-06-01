import dogfightControler.DogFightController;
import dogfightModel.DogfightModel;
import dogfightView.DogfightView;

public class DogFightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogFightController dogfightController = new DogFightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
		dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
		
	}

}
