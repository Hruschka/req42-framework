// Build configuration for arc42-generator (https://github.com/arc42/arc42-generator),
// see "Build the Distributions" in README.adoc.
// All paths in this file are relative to the directory of this file.
project {
    // base name of the main document (<LANG>/<name>.adoc) and of all generated files and ZIPs
    name = 'req42-framework'

    // prefix of the feature markers in the golden master, e.g. [role="req42help"]
    featurePrefix = 'req42'

    // the only image copied into the plain style
    logo = 'REQ42-logo.png'
}

goldenMaster {
    sourcePath = './'
    targetPath = 'build/src_gen/'

    // a list of all features contained in the golden master
    allFeatures = ['help', 'example']

    // style: list of features
    templateStyles = [
            'plain'    : [],
            'with-help': ['help'],
    ]
}

formats = [
    'asciidoc': [imageFolder: true],
    'html': [imageFolder: true],
    'epub': [imageFolder: false],
    'rst': [imageFolder: true],
    'markdown': [imageFolder: true],
    'markdownMP': [imageFolder: true],
    'markdownStrict': [imageFolder: true],
    'markdownMPStrict': [imageFolder: true],
    'gitHubMarkdown': [imageFolder: true],
    'gitHubMarkdownMP': [imageFolder: true],
    'mkdocs': [imageFolder: true],
    'mkdocsMP': [imageFolder: true],
    'textile': [imageFolder: true],
    'textile2': [imageFolder: true],
    'docx': [imageFolder: true],
    'docbook': [imageFolder: true],
    'latex': [imageFolder: true],
]

distribution {
    targetPath = 'dist/'
}
