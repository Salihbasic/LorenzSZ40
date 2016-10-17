/*
 * This program is a simulation of LorenzSZ40 machine used by the Germans in WWII. It can be run using GUI.
 * Copyright (C) 2016 Mahir Salihbašić
 * 
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *   
 *   More info can be found by clicking on About button and in Lorenz.txt
 *   
 *   You can contact me by email: nothingn262@gmail.com
 */

package me.lorenz;

public class Lorenz {

	//TODO: When finished create Lorenz.txt with brief explanation about the machine and the license for software.
	
		public static void main(String[] args) {
			
			//Creates new instance of Baudot class
			Baudot baudot = new Baudot();
			
			//Creates new instance of LorenzGUI class
			LorenzGUI lorenzGUI = new LorenzGUI();
			
			//Create new instance of TextListener class
			TextListener textListener = new TextListener();
			
			//Creates a new instance of ButtonListener
			ButtonListener buttonListener = new ButtonListener();
			
			//Creates new instance of Cipher class
			Cipher cipher = new Cipher();
			
			//Creates new instance of Pins class
			Pins pins = new Pins();
			
			//Cells for setGUI() method from Pins class
			pins.setGUI(lorenzGUI);
			
			//Calls for setGUI() method from TextListener class
			textListener.setGUI(lorenzGUI, cipher, baudot, pins);
			
			//Calls for setGUI method from ButtonListener class
			buttonListener.setGUI(lorenzGUI);
			
			//Calls for populateMaps() method from Baudot class
			baudot.populateMaps();
			
			//Calls for guiLayout() method from LorenzGUI class
			lorenzGUI.guiLayout();
			
		}
}
