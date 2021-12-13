package objgame.objmap;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import game.position.Position;

public class Rock extends ObjMap {

	public Rock(int x, int y) {
		super(x, y);
		initImage();
	}
	public Rock(Position pos) {
		super(pos);
		initImage();
	}

	@Override
	public void initImage() {
		try {
            BufferedImage tmp = ImageIO.read(new File("src/images/map/rock.png"));
            setImage(tmp);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
