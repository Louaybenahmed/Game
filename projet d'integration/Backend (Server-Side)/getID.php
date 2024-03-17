<?php
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Methods: POST, GET, OPTIONS");
header("Access-Control-Allow-Headers: Content-Type");

include "dbconnect.php";

// Check if the email parameter is provided in the request
if(isset($_GET['email'])) {
    // Sanitize the input to prevent SQL injection
    $email = htmlspecialchars($_GET['email']);

    // Query to fetch data from the 'utilisateurs' table for a specific user email
    $sql = "SELECT id FROM utilisateurs WHERE email = ?";
    $stmt = $bdd->prepare($sql);
    $stmt->execute([$email]);

    // Fetch data and encode it as JSON
    $user = $stmt->fetch(PDO::FETCH_ASSOC);

    // Check if the user is found
    if ($user) {
        echo json_encode($user);
    } else {
        // If no user found, return an empty object
        echo json_encode([]);
    }
} else {
    // If email parameter is not provided, return an error message
    echo json_encode(["error" => "No email provided"]);
}
?>
