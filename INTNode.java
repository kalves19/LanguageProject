import java.util.HashMap;
public class INTNode extends Node {

        private int value;

        public INTNode(String image) {
                value = Integer.parseInt(image);
        }


	@Override
        public int eval() {
                return value;
        }

}

