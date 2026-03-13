const express = require("express");
const bodyParser = require("body-parser");

const app = express();
app.use(bodyParser.json());
app.use(express.static("public"));

let users = [{ username: "student", password: "123" }];
let feedbacks = [];

app.post("/login", (req, res) => {
    const { username, password } = req.body;

    const user = users.find(
        u => u.username === username && u.password === password
    );

    if (user) {
        res.json({ success: true });
    } else {
        res.json({ success: false });
    }
});

app.post("/feedback", (req, res) => {
    feedbacks.push(req.body.feedback);
    res.json({ message: "Feedback saved" });
});

app.listen(3000, () => {
    console.log("Server running on http://localhost:3000");
});
