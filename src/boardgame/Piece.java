package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // não haveria a necessidade desse comando. Quando não tem valor atribuido,
							//o Java já define como null
	}

	protected Board getBoard() {
		return board;
	}

}
