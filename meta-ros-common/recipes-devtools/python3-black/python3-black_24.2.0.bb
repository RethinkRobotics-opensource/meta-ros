SUMMARY = "The uncompromising code formatter."
HOMEPAGE = "https://github.com/psf/black"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d3465a2a183908c9cb95bf490bd1e7ab"

DEPENDS = "python3 python3-hatchling-native python3-hatch-fancy-pypi-readme-native python3-hatch-vcs-native"

PYPI_PACKAGE = "black"

inherit pypi python_hatchling python_setuptools_build_meta

SRC_URI[sha256sum] = "bce4f25c27c3435e4dace4815bcb2008b87e167e3bf4ee47ccdc5ce906eb4894"
