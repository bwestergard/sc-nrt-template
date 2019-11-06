SynthDef(
    \nrtPing,
    {
        arg freq = 440;
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

f = File("./build/score.osc", "w");

c = [0, [\s_new, \nrtPing, 1001, 0, 0, \freq, 440]].asRawOSC;
f.write(c.size); // each bundle is preceded by a 32 bit size.
f.write(c); // write the bundle data.

// scsynth stops processing immediately after the last command, so here is
// a do-nothing command to mark the end of the command stream.
c = [5, [0]].asRawOSC;
f.write(c.size);
f.write(c);

f.close;

0.exit;