import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GameExercises extends GamePanel {
	int[] x;
	int[] y;
	int size;
	
	public GameExercises() {
		// Keep the array and variables from exercise 2
	    size = 25;
	    int xStart = 300;
	    int yStart = 300;
	    
	    // Add an array for snake positions (x and y)
	    x = new int[] { xStart, xStart, xStart, xStart };
	    y = new int[] { yStart, yStart + size + 1, 
	    		yStart + (size * 2) + 2, 
	    		yStart + (size * 3) + 3 };
	    
		startGame();
	}
	
	// Implement the drawing here
	public void paintComponent(Graphics canvas) {	
		// Keep the apple we drew from exercise 1
		canvas.setColor(Color.RED);
	    canvas.fillOval(150, 150, 25, 25);
	    canvas.setColor(Color.BLUE);
	    Font f = new Font("Helvetica Nueue", Font.BOLD, 24);
		canvas.setFont(f);
	    canvas.drawString("Exercise 3", 50, 50);
	    
	    // Invoke method for exercise 3
	    drawSnake(canvas, size, x, y);
	}
	
	public void drawSnake(Graphics canvas, int size, int[] x, int[] y) {
		Color c = Color.GREEN;
		canvas.setColor(c);
	    canvas.fillRect(x[0], y[0], size, size);
	    canvas.fillRect(x[1], y[1], size, size);
	    canvas.fillRect(x[2], y[2], size, size);
	    canvas.fillRect(x[3], y[3], size, size);
	}
	
	public void actionPerformed(ActionEvent e) {
		moveUp(x, y);
		repaint();
	}
	
	// Moves the coordinates for snake up
	public void moveUp(int[] x, int[] y) {
		
	}
}
