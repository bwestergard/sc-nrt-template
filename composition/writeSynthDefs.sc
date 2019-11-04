SynthDef(
    \nrtPing,
    {
        arg freq;
        Out.ar(
            0,
            SinOsc.ar(freq).dup * XLine.ar(
                -20.dbamp,
                -80.dbamp,
                8,
                doneAction:2
            )
        );
    }
).writeDefFile("./build");

Pbind(
    \instrument, \nrtPing,
    \dur, 0.25,
    \degree, Pseq([0,2,4,6], inf),
    \mtranspose, Pstep([1,4,0,0], 1, inf),
    \root, Pstep([0,5,10,15], 4, inf),
    \octave, Pstep([4,4,3,2]+1, 4, inf)
).asScore(8).writeOSCFile("./build/score.osc");

0.exit;