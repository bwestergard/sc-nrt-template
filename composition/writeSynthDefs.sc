SynthDef(
    \nrtPing,
    {
        arg freq = 440;
        Out.ar(
            0,
            SinOsc.ar(440).dup * XLine.ar(
                -20.dbamp,
                -80.dbamp,
                8,
                doneAction:2
            )
        );
    }
).writeDefFile("./build");

0.exit;