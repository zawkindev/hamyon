{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = with pkgs; [
    # Java Development Kit (replace with the desired version, e.g., openjdk17)
    openjdk17

    # Maven for building the project
    maven

    # Git for version control
    git

    # Optional: curl for API testing
    curl
  ];

  # Set JAVA_HOME environment variable
  JAVA_HOME = "${pkgs.openjdk17}/lib/openjdk";

  shellHook = ''
    echo "JAVA_HOME: $JAVA_HOME"
  '';
}
