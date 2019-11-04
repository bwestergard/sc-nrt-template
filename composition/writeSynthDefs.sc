SynthDef(
    \nrtPing,
    {
        arg freq;
        Out.ar(
            0,
            SinOsc.ar(freq).dup * XLine.ar(
                -16.dbamp,
                -80.dbamp,
                1,
                doneAction:2
            )
        );
    }
).writeDefFile("./build");

Pbind(
    \instrument, \nrtPing,
    \dur, 0.25,
    \degree, Pseq([0,2,4,6])
).asScore(1.5).writeOSCFile("./build/score.osc");

0.exit;