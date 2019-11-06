var osc = require("osc");

const oscMsg = {
    address: "/s_new",
    args: [
        {
            type: "s",
            value: "\nrtPing"
        },
        {
            type: "i",
            value: 1001
        },
	{
            type: "i",
            value: 0
        },
	{
            type: "i",
            value: 0
        },
	{
            type: "s",
            value: "\freq"
        },
	{
            type: "f",
            value: 440
        }
    ]
};
