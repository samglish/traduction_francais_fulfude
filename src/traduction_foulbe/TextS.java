package traduction_foulbe;

// Java code to convert text to speech 

import java.util.Locale; 
import javax.speech.Central; 
import javax.speech.synthesis.Synthesizer; 
import javax.speech.synthesis.SynthesizerModeDesc; 

public class TextS { 

	public static void main(String[] args) 
	{ 

		try { 
			// Set property as Kevin Dictionary 
			System.setProperty( 
				"freetts.voices", 
				"com.sun.speech.freetts.en.us"
					+ ".cmu_us_kal.KevinVoiceDirectory"); 

			// Register Engine 
			Central.registerEngineCentral( 
				"com.sun.speech.freetts"
				+ ".jsapi.FreeTTSEngineCentral"); 

			// Create a Synthesizer 
			Synthesizer synthesizer 
				= Central.createSynthesizer( 
					new SynthesizerModeDesc(Locale.US)); 

			// Allocate synthesizer 
			synthesizer.allocate(); 

			// Resume Synthesizer 
			synthesizer.resume(); 

			// Speaks the given text 
			// until the queue is empty. 
			synthesizer.speakPlainText( 
				"Samuel", null); 
			synthesizer.waitEngineState( 
				Synthesizer.QUEUE_EMPTY); 

			// Deallocate the Synthesizer. 
			synthesizer.deallocate(); 
		} 

		catch (Exception e) { 
			e.printStackTrace(); 
		} 
	} 
} 
