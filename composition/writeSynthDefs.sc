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

0.exit;