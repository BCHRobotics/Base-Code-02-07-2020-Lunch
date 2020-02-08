# Base-Code-02-07-2020-Lunch

Change logs for February 8 2020 at 10am-12pm

Retriever
Added – topLimit and bottomLimit integers to retriever, and set the values in periodic.
Changed – getting the limit value from the if statement to get in periodic

PID
Added – PID class to handle PID functions. 
	Able to set PID and run to receive rcw.

Shooter
Removed – old PID system
Added – PID object for control of PID
Changed – PID in setTurret to use new function
Removed - Adjustable hood functions and variables.
Changed – PID in setWheelSpeed to use new function
Added – encoderCal to be based on the gear box ratios.
Added – Encoder numbers to the smart dashboard
