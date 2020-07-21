package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // n�o haveria a necessidade desse comando. Quando n�o tem valor atribuido,
							//o Java j� define como null
	}

	protected Board getBoard() {
		return board;
	}

}
